import java.util.Date;

public class Jaeger {

    private String nickName;
    private Date launched;
    private String mark;
    private String origin;
    private String status;
    private float height;
    private float weight;

    public Jaeger(String nickName, Date launched, String mark, String origin, String status, float height, float weight) {
        this.nickName = nickName;
        this.launched = launched;
        this.mark = mark;
        this.origin = origin;
        this.status = status;
        this.height = height;
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public Date getLaunched() {
        return launched;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void move() {
        System.out.println(this.nickName + ": начал движение");
    }

    public int scanKaiju() {
        if(this.status.equals("Destroyed")) {
        	System.out.println(this.nickName + ": Сканеры вышли из строя");
            return 0;
        } else {
        	System.out.println(this.nickName + ": Запас прочности брони Kaiju 80%");
            return 1;
        }
    }

    public void atiKaijuMissileLauncher() {
        int hit = (int) ( Math.random() * 2 );
        if(hit == 0) {
            System.out.println(this.nickName + " не попал :(");
        } else {
            System.out.println(this.nickName + ": точно в цель!");
        }
     }

     public void protectionFromShot() {
         int hit = (int) ( Math.random() * 2 );
         if(hit == 0) {
             System.out.println(this.nickName + ": в вас попали!");
             this.status = "Destroyed";
         } else {
             System.out.println(this.nickName + ": выстрел отражен");
         }
     }

     public void repair() {
         System.out.println(this.nickName + ": броня восстановлена");
         this.status = "Active";
     }
}