package quene;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        CircleQueue circleQueue = new CircleQueue(4);
        char result = ' '; //接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit)推出程序");
            System.out.println("a(add)添加数据");
            System.out.println("g(get)取出数据");
            System.out.println("h(head)查看队列头元素");
            result = scanner.next().charAt(0); //接受一个字符
            switch (result){
                case 's':try {
                    circleQueue.showQueue();
                }catch (Exception e){
                    e.printStackTrace();
                }
                    break;
                case 'a':
                    System.out.println("输入一个数字");
                    int value = scanner.nextInt();
                    circleQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        System.out.println("取出的数据为："+circleQueue.getQueue());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 'h':
                    try{
                        System.out.println("队列的头元素为："+circleQueue.headQueue());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 'e':
                    flag = false;
                    scanner.close();
                    break;
            }
        }
        System.out.println("程序结束");

    }
}
