package SchoolAssignments;//public class CopilotPrompts {
//    //generate a method to reverse a string
//    public static String reverseString(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
//    //generate a method to sort an array of integers with insertion sort
//    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
//    //generate a method to sort an array of integers with bubble sort
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//    //// Create a class `Book` with fields for title, author, and ISBN, and a method to display the book's details\
//    public static class Book {
//        private String title;
//        private String author;
//        private String isbn;
//        public Book(String title, String author, String isbn) {
//            this.title = title;
//            this.author = author;
//            this.isbn = isbn;
//        }
//        public void display() {
//            System.out.println("Title: " + title);
//            System.out.println("Author: " + author);
//            System.out.println("ISBN: " + isbn);
//        }
//    }
//    // Implement a method to merge two sorted arrays into one sorted array
//    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int[] arr3 = new int[n1 + n2];
//        int i = 0, j = 0, k = 0;
//        while (i < n1 && j < n2) {
//            if (arr1[i] < arr2[j]) {
//                arr3[k++] = arr1[i++];
//            } else {
//                arr3[k++] = arr2[j++];
//            }
//        }
//        while (i < n1) {
//            arr3[k++] = arr1[i++];
//        }
//        while (j < n2) {
//            arr3[k++] = arr2[j++];
//        }
//        return arr3;
//    }

    // generate a game with graphics and user input to finish a maze but if you touch the walls you lose
    public class MazeRunner {
        public static void main(String[] args) {
            // The maze represented as a 2D array
            int[][] maze = {
                    {1, 1, 1, 1, 1},
                    {1, 0, 0, 0, 1},
                    {1, 0, 1, 0, 1},
                    {1, 0, 3, 0, 1},
                    {1, 1, 1, 1, 1}
            };

            int playerX = 1;
            int playerY = 1;
            int goalX = 2;
            int goalY = 3;
            boolean gameOver = false;

            while (!gameOver) {
                // Display the maze
                for (int i = 0; i < maze.length; i++) {
                    for (int j = 0; j < maze[i].length; j++) {
                        if (i == playerY && j == playerX) {
                            System.out.print("2 ");
                        } else {
                            System.out.print(maze[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

                // Get user input
                System.out.print("Enter a direction (WASD): ");
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                String input = scanner.nextLine();
                char direction = input.charAt(0);

                // Store old player position for reference
                int oldPlayerX = playerX;
                int oldPlayerY = playerY;

                // Move the player based on input
                switch (direction) {
                    case 'W':
                        playerY--;
                        break;
                    case 'A':
                        playerX--;
                        break;
                    case 'S':
                        playerY++;
                        break;
                    case 'D':
                        playerX++;
                        break;
                    default:
                        System.out.println("Invalid input! Use W, A, S, or D.");
                        continue; // Skip the rest of the loop
                }

                // Check if the new position is a wall
                if (maze[playerY][playerX] == 1) {
                    System.out.println("SchoolAssignments.Game over! You hit a wall!");
                    gameOver = true;
                    break;
                }

                // Check if the player reached the goal
                if (playerX == goalX && playerY == goalY) {
                    System.out.println("Congratulations! You reached the goal!");
                    gameOver = true;
                    break;
                }
            }
        }
    }
