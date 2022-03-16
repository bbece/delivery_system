package com.company;

import java.util.*;


public class Main {
    public static ArrayList<mahalle> motor_kurye_olusturma(String[] mahalleAdi, Random rnd, String[] foods, int[] teslimatSayisi, int MAX_ORDER){
        ArrayList<mahalle>motor_kurye = new ArrayList<>(mahalleAdi.length);
        for(int i=0;i< mahalleAdi.length;i++){//iç içe forlar ile random yemek ve sipariş sayısı ile birlikte o mahalle oluşturulup,mahalle ismi dışındaki bilgiler generic list olarak mahalle adı ile birlikte motor kurye arrayListinde tutulur.
            List<teslimat> genericList=new ArrayList<>();
            ArrayList<Integer> indexs=new ArrayList<>();//yemek seçimlerinin indexini tutan ArrayList
            for(int y=0;y<teslimatSayisi[i];y++){
                int rndIndex=rnd.nextInt(foods.length);
                while(indexs.contains(rndIndex)){
                    rndIndex=rnd.nextInt(foods.length); }
                indexs.add(rndIndex);
                String yemek=foods[rndIndex];
                int rndNumberofOrder=rnd.nextInt(MAX_ORDER+1);

                while(rndNumberofOrder==0){
                    rndNumberofOrder=rnd.nextInt(MAX_ORDER+1);

                }

                teslimat newTeslimat=new teslimat(yemek,rndNumberofOrder);
                genericList.add(newTeslimat);// her mahalle için generic list oluşturulur ve her teslimat eklenir.


            }
            mahalle lastVersion=new mahalle(mahalleAdi[i],genericList);
            motor_kurye.add(lastVersion);
    }return motor_kurye;}

    public static void main(String[] args) {

        String[] mahalleAdi = { "Özkanlar", "Evka 3", "Atatürk", "Erzene", "Kazımdirik", "Mevlana", "Doğanlar", "Ergene" };
        int[] teslimatSayisi = { 5, 2, 7, 2, 7, 3, 0, 1 };
        //ArrayList yapısında ve mahalle genericinde istenilen Motor kurye listesi
        String[] foods={"pilav","pizza","türlü","simit","kızartma","çorba","sarma","döner","kebap","hamburger","tost","ev yemeği"};
        Random rnd=new Random();
        int MAX_ORDER=20;
        ArrayList<mahalle>motor_kurye = new ArrayList<>(mahalleAdi.length);
        int countGenericList=0;//motor kurye Listesinde kullanlına generic Lİst sayısı
        int totalNumberofOrders=0;//toplam sipariş sayısı(random sipariş sayı toplamları)
        Stack stack = new Stack();//Stack sınıfımızdan oluşturduğumuz constructor
        Queue queue=new Queue();//Queue sınıfımızdan oluşsturduğumuz constructor
        List<mahalle> mahalleOrders=new ArrayList<>();
        List<mahalle> Liste=new ArrayList<>();//Kuyruk(queue) yapısı LinkedList gibi olduğu için , Priority queue ve queue se bu List yapısını kullandım.
        pQueue PqueueListe= new pQueue(Liste);
        motor_kurye=motor_kurye_olusturma(mahalleAdi,rnd,foods,teslimatSayisi,MAX_ORDER);
        //bizden istenen motor kurye ArrayListi oluşur
        for(int i=0;i<motor_kurye.size();i++) {
            stack.push(motor_kurye.get(i));//yığıt a eleman eklenir
            queue.Enqueue(motor_kurye.get(i));//kuyruğa eleman eklenir
            totalNumberofOrders+=teslimatSayisi[i];//toplam teslimat sayısı hesaplanır
            if((motor_kurye.get(i)).getGenericList()!=null){
            countGenericList++;}//toplam generic list sayısı hesaplanır
        }
        // yazdırma işlemleri
        System.out.println("<Motor kurye yazdırma>");
        for(int x=0;x<motor_kurye.size();x++){
            System.out.println(motor_kurye.get(x).getMahalleAdi());
            System.out.println(motor_kurye.get(x).getGenericList());
        }
        System.out.println("motor kurye listesi içindeki generic list sayısı:"+" "+countGenericList);
        System.out.println("Bileşik Veri Yapısındaki Mahallelerin toplam teslimat sayısı:"+" "+totalNumberofOrders);
        System.out.println("stack yazdırma:");
        int stackSize=stack.size();
        for(int a=0;a<stackSize;a++){//stack yazdırılır
            System.out.println(stack.pop());

        }System.out.println("queue yazdırma:");
        int queueuSize=queue.size();//queue yazdırma
        for (int b=0;b<queueuSize;b++){
            System.out.println(queue.poll());
        }

        for(int x=0;x<motor_kurye.size();x++){
            mahalle ordersMahalle=new mahalle(mahalleAdi[x],teslimatSayisi[x]);
            mahalleOrders.add(ordersMahalle);

        }



        System.out.println("-----------------------------------------------------------");
        System.out.println("Priority queue");

//Priority quee oluşturulur Enqueue metodu ile mahalleOrders daki elemanlar eklenir.
        PqueueListe.Enqueue(mahalleOrders);
        PqueueListe.Listeyazdirma();
        System.out.println("Priority Quee artandan azalana doğru silme ve yazdırma işlemi.");
//PQueue boşalana kadar max siparişe sahip mahalleler yazdırılır ve kuyruktan silinir.
       while(!PqueueListe.isEmpty()){
            PqueueListe.Dequeue();


        }}}