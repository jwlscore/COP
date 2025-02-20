import java.util.Scanner;

public class WorkHoursTracker {
    public static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static String[] shifts = {"morning", "afternoon", "evening", "overtime"};
    public static void main(String[] args) {
        int[][] arr = inputCollector();
        totalHoursWorked(arr);
        averageDailyHours(arr);
        minimumHours(arr);
        maximumHours(arr);
    }

    static int[][] inputCollector() {
        int[][] hoursWorked = new int[7][4];
        
        Scanner scanner = new Scanner(System.in);
        
        int weekDays = 7;
        int shiftsDay = 4;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                    System.out.printf("What hours did you work on %s %s?\n", days[i], shifts[j]);
                    int num = -1;
                    while (num < 0) {
                        num = scanner.nextInt();
                        if (num < 0) {
                            System.out.println("Hours must not be negative.");
                        }
                        hoursWorked[i][j] = num;
                    }
            }
        }
        return hoursWorked;
    }

    static void totalHoursWorked(int[][] arr) {
        for (int i = 0; i < 7; i++) {
            int total = 0;

            for (int j = 0; j < 4; j++) {
                total += arr[i][j];
            }

            System.out.printf("Total hours worked on %s: %d \n", days[i], total);
        }
    }

    static void averageDailyHours(int[][] arr) {
        for (int i = 0; i < 7; i++) {
            int total = 0;

            for (int j = 0; j < 4; j++) {
                total += arr[i][j];
            }

            double average = total/4.0;

            System.out.printf("Average hours worked on %s: %.2f \n", days[i], average);
        }
    }

    static void minimumHours(int[][] arr) {
        int leastDay = 0;
        int leastShift = 0;
        int minimum = arr[0][0];

        for (int i = 0; i < 7; i++) {
            
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] < minimum) {
                    minimum = arr[i][j];
                    leastDay =  i;
                    leastShift = j;
                }
            }
        }
        
        System.out.printf("The least hours were worked on %s %s for a total of %d hours.\n", days[leastDay], shifts[leastShift], minimum);
    }

    static void maximumHours(int[][] arr) {
        int mostDay = 0;
        int mostShift = 0;
        int maximum = arr[0][0];

        for (int i = 0; i < 7; i++) {
            
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] > maximum) {
                    maximum = arr[i][j];
                    mostDay =  i;
                    mostShift = j;
                }
            }
        }
        
        System.out.printf("The most hours were worked on %s %s for a total of %d hours.\n", days[mostDay], shifts[mostShift], maximum);
    }
}