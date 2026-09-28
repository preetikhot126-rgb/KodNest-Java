
public class Book3 {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public void getData() {
        System.out.println(pageNum);
    }

}
