package ru.geekbrains.lesson3;
import java.util.Random;
import java.util.Scanner;
    public class HomeWorkApp4 {

        public static Random random = new Random();
        public static Scanner scanner = new Scanner(System.in);

        public static char[][] map;
        public static int mapW;
        public static int mapH;
        public static int mapMin = 4;
        public static int mapMax = 6;
        public static char empty = ' ';
        public static char ready = '*';

        public static char player = 'P';
        public static int playerHP = 100;
        public static int playerX;
        public static int playerY;
        public static final int playerUp = 8;
        public static final int playerLeft = 4;
        public static final int playerRight = 6;
        public static final int playerDown = 2;

        public static char trap = ' ';
        public static int trapAttack;
        public static int trapCount;
        public static int trapX = 5;
        public static int trapY = 15;


        public static void main(String[] args) {
            createMap();
            spawnPlayer();
            spawnTrap();


            while (true) {
                showMap();
                movePlayer();

                if (!isPlayerAlive()) {
                    System.out.println("Alevtina dead");
                    break;
                }

                if (isFullMap()) {
                    System.out.println("Alevtina win this map");
                    createMap();
                    spawnPlayer();
                    spawnTrap();
                }
            }
            System.out.println("GAME OVER");
        }

        public static void createMap() {
            mapW = randomValue(mapMin, mapMax);
            mapH = randomValue(mapMin, mapMax);
            map = new char[mapH][mapW];

            for (int y = 0; y < mapH; y++) {
                for (int x = 0; x < mapW; x++) {
                    map[y][x] = empty;
                }
            }

            System.out.println("Map size is " + mapW + "x" + mapH);
        }

        public static void showMap() {

            for (int i = 0; i < mapH; i++) {
                for (int j = 0; j < mapW; j++) {
                    System.out.print(map[i][j] + "|");
                }
                System.out.println();
            }
        }

        public static void spawnPlayer() {
            playerX = randomValue(0, mapW - 1);
            playerY = randomValue(0, mapH - 1);
            map[playerY][playerX] = player;
            System.out.println("Alevtina appeared [" + (playerX + 1) + ":" + (playerY + 1) + "]");
        }

        public static void spawnTrap() {
            trapAttack = randomValue(trapX, trapY);
            trapCount = (mapW + mapH) / 2;

            int trapX;
            int trapY;

            for (int i = 1; i <= trapCount; i++) {

                do {
                    trapX = random.nextInt(mapW);
                    trapY = random.nextInt(mapH);
                } while (!isEmpty(trapX, trapY));

                map[trapY][trapX] = trap;
            }
            System.out.println(trapCount + " trap's has been created. Trap's Attack = " + trapAttack);
        }

        public static void movePlayer() {

            int currentPlayerX = playerX;
            int currentPlayerY = playerY;

            int playerDestination;

            do {
                System.out.print("Enter your move: (Up: " + playerUp + " | Down: " + playerDown +
                        " | Left: " + playerLeft + " | Right: " + playerRight + ") >>> ");

                playerDestination = scanner.nextInt();

                if (playerDestination == playerUp) {
                    playerY -= 1;
                } else if (playerDestination == playerDown) {
                    playerY += 1;
                } else if (playerDestination == playerLeft) {
                    playerX -= 1;
                } else if (playerDestination == playerRight) {
                    playerX += 1;
                }

            } while (!checkValidMove(currentPlayerX, currentPlayerY, playerX, playerY));

            playerMoveAction(currentPlayerX, currentPlayerY, playerX, playerY);

        }

        public static boolean isEmpty(int x, int y) {
            return map[y][x] == empty;
        }

        public static boolean isFullMap() {
            for (int y = 0; y < mapH; y++) {
                for (int x = 0; x < mapW; x++) {
                    if (map[y][x] == empty) return false;
                }
            }
            return true;
        }

        public static boolean checkValidMove(int pastX, int pastY, int nextX, int nextY) {
            if (nextX >= 0 && nextX < mapW && nextY >= 0 && nextY < mapH) {
                System.out.println("Alevtina moves to [" + (nextX + 1) + ":" + (nextY + 1) + "] success");
                return true;
            } else {
                System.out.println("Alevtina move invalid! Please try again!");
                playerX = pastX;
                playerY = pastY;
                return false;
            }
        }

        public static void playerMoveAction(int pastX, int pastY, int nextX, int nextY) {
            if (map[nextY][nextX] == trap) {
                playerHP -= trapAttack;
                trapCount--;
                System.out.println("Alevtina has been attack. HP = " + playerHP);
            }

            map[nextY][nextX] = player;
            map[pastY][pastX] = ready;

        }

        public static int randomValue(int min, int max) {
            return min + random.nextInt(max - min + 1);
        }

        public static boolean isPlayerAlive() {
            return playerHP > 0;
        }

    }
