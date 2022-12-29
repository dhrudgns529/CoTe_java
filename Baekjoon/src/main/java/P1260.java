import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1260
// dfs와 bfs의 기본 개념을 위한 문제

// dfs(깊이 우선 탐색) - 재귀, 스택(push, pop)-while문을 이용하여 구현
// bfs(너비 우선 탐색) - 큐(add, remove)를 이용하여 구현
public class P1260 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int v = in.nextInt();

        int[][] graph = new int[n+1][n+1];

        for(int i=0; i<m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = graph[b][a] = 1; // 양방향
        }
        int[] visit1 = new int[n+1];
        dfs(graph, visit1, v, n);

        System.out.println();

        int[] visit2 = new int[n+1];
        bfs(graph, visit2, v, n);
    }

    static void dfs(int[][] graph, int[] visit, int v, int n){
        visit[v] = 1;
        System.out.print(v + " ");

        for(int i=1; i<n+1; i++){
            if(visit[i] == 0 && graph[v][i] != 0){
                dfs(graph, visit, i, n);
            }
        }
    }


    static void bfs(int[][] graph, int[] visit,int v, int n){
        Queue<Integer> queue = new LinkedList<>();
        visit[v] = 1;
        queue.add(v);
        while(!queue.isEmpty()){
            int a = queue.remove();
            System.out.print(a + " ");

            for(int i=1; i<n+1; i++){
                if(visit[i] == 0 && graph[a][i] != 0){
                    visit[i] = 1;
                    queue.add(i);
                }
            }
        }
    }
}
