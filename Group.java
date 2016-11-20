import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    ArrayList<Shape>  list= new ArrayList<Shape>();
    public void PainterStart(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shape name, enter  \"exit\" to finish the program");
        String shapeName = scanner.next();
        while (! shapeName.equals("exit")) {
                        if (shapeName.equals("c"))
            {
                Circle circle = new Circle();
                System.out.println("Enter radius: ");
                circle.setRadius(scanner.nextInt());
                circle.make();
                list.add(circle);
            }
            else
                {
                if (shapeName.equals("s"))
                {
                    Square square = new Square();
                    System.out.println("Enter side: ");
                    square.setSide(scanner.nextInt());
                    square.make();
                    list.add(square);

                }
                else {
                    if (shapeName.equals("t"))
                    {
                        Triangle triangle = new Triangle();
                        System.out.println("Enter side: ");
                        triangle.setSides(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                        triangle.make();
                        list.add(triangle);

                    } else {
                        System.out.println("Error");
                    }
                }
            }
            System.out.println("Enter shape name, enter  \"exit\" to finish the program");
            shapeName = scanner.next();
        }
        printList();
    }
    private void printList(){
        for (int i = 0; i<list.size();i++){
            System.out.println((i+1)+" "+list.get(i).getName());
        }

    }
}

