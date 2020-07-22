package com.qingfeng.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

@SuppressWarnings("all")
/**
 * study graph
 */
public class Graph {
    /**
     *
     */
    private ArrayList<String> vertexList;
    /**
     *
     */
    private int[][] edges;
    /**
     *
     */
    private int numOfEdges;

    private boolean[] idVisited;

    /**
     * init
     *
     * @param n
     */
    public Graph(int n) {
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;

    }

    public int getFirstNeighbor(int index) {
        for (int j = 0; j < vertexList.size(); j++) {
            if (edges[index][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    public int getNextNeighbor(int v1, int v2) {
        for (int j = v2 + 1; j < vertexList.size(); j++) {
            if (edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    /**
     * 深度优先遍历算法
     * @param idVisited
     * @param i
     */
    public void dfs(boolean[] idVisited, int i) {
        System.out.print(getValueByIndex(i) + "->");
        idVisited[i] = true;
        int w = getFirstNeighbor(i);
        while (w != -1) {
            if (!idVisited[w]) {
                dfs(idVisited, w);
            }
            w = getNextNeighbor(i, w);
        }
    }

    public void dfs() {
        idVisited = new boolean[5];
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!idVisited[i]) {
                dfs(idVisited, i);
            }
        }
    }


    /**
     * @param vertex
     */
    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    /**
     * @param v1
     * @param v2
     * @param weight
     */
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    /**
     * @return
     */
    public int getNumOfVertex() {
        return vertexList.size();
    }

    /**
     *
     */
    public int getNumOfEdges() {
        return numOfEdges;
    }

    /**
     * @param i
     * @return
     */
    public String getValueByIndex(int i) {
        return vertexList.get(i);
    }

    /**
     * @param v1
     * @param v2
     * @return
     */
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    /**
     *
     */
    public void showGraph() {
        for (int[] link : edges) {
            System.err.println(Arrays.toString(link));
        }

    }

    public void bfs(boolean[] isVesited, int i) {

        int u;
        int w;
        LinkedList queue = new LinkedList();
        System.out.print(getValueByIndex(i) + "=>");
        isVesited[i] = true;
        queue.addLast(i);
        while (!queue.isEmpty()) {
            u = (int) queue.removeFirst();
            w = getFirstNeighbor(u);
            while (w != -1) {
                if (!idVisited[w]) {
                    System.out.print(getValueByIndex(w) + "=>");
                    isVesited[w] = true;
                    queue.addLast(w);
                }
                w = getNextNeighbor(u, w);
            }
        }
    }

    public void bfs() {
        idVisited = new boolean[5];
        for (int i = 0; i <getNumOfVertex() ; i++) {
            if (!idVisited[i]){
                bfs(idVisited,i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        String vertexs[] = {"A", "B", "C", "D", "E"};
        Graph graph = new Graph(n);
        for (String vertex : vertexs) {
            graph.insertVertex(vertex);
        }
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);
        graph.dfs();
        System.out.println("\n");
        graph.showGraph();

        graph.bfs();
    }
}
