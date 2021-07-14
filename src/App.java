import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Team dH = new Team();
        System.out.println("DANH SÁCH CẦU THỦ");
        dH.getAllPlayers();
        
        
       System.out.println();
       System.out.println();
        while (true) {
        System.out.println("Chọn đội hình : ");
                 System.out.println("chọn 1:  1GK - 4DF - 4MF - 2FW");
                 System.out.println("chọn 2:  1GK - 4DF - 3MF - 3FW");
                 System.out.println("chọn 3:  1GK - 3DF - 5MF - 2FW");
        int i = Integer.valueOf( sc.nextLine());
        switch (i) {
            case 0:
            System.exit(0);
            case 1:
                dH.choose1();
                break;
            case 2:
                dH.choose2();
                break;
            case 3:
                dH.choose3();
                break;
            
        }
    }
}
}