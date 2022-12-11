import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = in.nextLine();

        System.out.print("Введите средний балл: ");
        double averageMark = in.nextDouble();

        System.out.println("Введите номер группы: ");
        String group = in.nextLine();

        Student student = new Student(name,lastName,group, averageMark);

        Aspirant aspirant = new Aspirant(name,lastName,group, averageMark, "Что то");
        System.out.println("Вы аспирант? \n 1.Да \n 2.Нет");
        int i = in.nextInt();
        System.out.println("Ваша стипендия:");
        switch(i){
            case 1:
                System.out.println(aspirant.getScholarship());
                break;
            case 2:
                System.out.println(student.getScholarship());
                break;

        }

    }
}