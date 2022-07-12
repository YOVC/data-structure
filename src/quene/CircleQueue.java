package quene;
public class CircleQueue {
    /**
     * 使用数组作为队列
     */
    private final int[] arr;

    /**
     * 队列的最大长度
     */
    private final int maxsize;

    /**
     * front指向队列的第一个元素
     */
    private int front;

    /**
     * rear指向队列最后一个元素的下一个位置
     */
    private int rear;

    /**
     * 队列的初始化
     * @param maxsize 队列的最大长度，最大有效数据个数为maxsize-1
     */
    public CircleQueue(int maxsize){
        this.maxsize = maxsize;
        front = 0;
        rear = 0;
        arr = new int[maxsize];
    }

    /**
     * 判断队列是否满了
     * @return boolean
     */
    public boolean isFull(){
        //语句1：判断队列是否满了
        return (rear + 1) % maxsize == front;
    }

    /**
     * 判断队列是否为空
     * @return boolean
     */
    public boolean isEmpty(){

        return rear == front;
    }

    /**
     * 向队列中添加数据
     * @param item 需要添加的数据
     */
    public void addQueue(int item){
        //1.判断队列是否满了
        if(isFull()){
            System.out.println("队列已满，无法添加数据");
            return;
        }
        //2.向队列中加入数据
        arr[rear] = item;
        //语句2：rear后移，注意考虑取模
        rear = (rear + 1) % maxsize;
    }

    /**
     * 从队列中取出数据
     * @return 队列不为空取出数据，反之抛出异常
     */
    public int getQueue(){
        //1.判断队列是否为空
        if(isEmpty()){
            throw new RuntimeException("队列为空，无法取出数据");
        }
        //2.取出数据
        int result = arr[front];
        //语句3.front后移,注意取模
        front = (front + 1) % maxsize;
        //4.返回数据
        return result;
    }

    /**
     * 查看队列的头数据
     * @return 队列不为空查看数据，反之抛出异常
     */
    public int headQueue(){
        //1.判断队列是否为空
        if(isEmpty()){
            throw new RuntimeException("队列为空，无法取出数据");
        }
        //2.返回数据
        return arr[front];
    }

    /**
     * 队列有效数据个数
     * @return 有效数据个数
     */
    public int size(){
        //语句4：队列有效数据个数计算
        return (rear - front + maxsize) % maxsize;
    }


    /**
     * 遍历队列中的有效数据
     */
    public void showQueue(){
        //1.判断队列是否为空
        if(isEmpty()){
            throw new RuntimeException("队列为空，无法取出数据");
        }
        for(int i = front;i<front + size();i++){
            System.out.println("arr["+(i%maxsize)+"] = "+arr[i%maxsize]);
        }
    }


}
