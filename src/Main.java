import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int para=0;
        do {
            System.out.println("Lütfene sisteme geçerli para çekme tutarını girin");
            para= klavye.nextInt();
        }while (para%5!=0);
        int ikiyuz=0;
        int yuz=0;
        int elli=0;
        int yirmi=0;
        int on=0;
        int bes=0;
        while (para>=200){
            para=para-200;
            ikiyuz=ikiyuz+1;
        }
        while (para>=100){
            para=para-100;
            yuz=yuz+1;
        }
        while (para>=50){
            para=para-50;
            elli=elli+1;
        }
        while (para>=20){
            para=para-20;
            yirmi=yirmi+1;
        }
        while (para>=10){
            para=para-10;
            on=on+1;
        }
        while (para>=5){
            para=para-5;
            bes=bes+1;
        }
        System.out.println("Sistemnden en az sayıda adet ile para çekme işlemi için şunlaru kullanmıştır");
        System.out.println(ikiyuz+"adet 200");
        System.out.println(yuz+"adet 100");
        System.out.println(elli+"adet 50");
        System.out.println(yirmi+"adet 20");
        System.out.println(on+"adet 10");
        System.out.println(bes+"adet 5");
        int top=ikiyuz+yuz+elli+yirmi+on+bes;
        System.out.println("Toplam kullanılan adet="+top);
    }
}