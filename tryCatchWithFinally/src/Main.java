
public class Main {
    public static void main(String[] args) {
        /*
        Finally blok'unun en önemli özelliği try-catch yapılarında hata oluşsun yada oluşmasın mutlaka ve mutlaka .....
        Finally BLOKLARI çalışıyor...
        kodlarda mutlaka yapılması istenen bir alan varsa bunlar finally içerisinde ifade edilmelidir.
        örnek olarak == 
        DOSYA KAPAMA İŞLEMİ,
        VERİ TABANI BAĞLANTISI KESME İŞLEMİ.....
        arka planda kaynakların gereksiz yere kullanılmaması için mutlaka yapılamsı gerekn işlemler olarak tarif edebiliriz.
        
        */
        try {
            String s = null ;//herhangi bir değeri yok 
            System.out.println(s.hashCode());//değer yok o yüzden hata alıyoruz ...
            
        } catch (NullPointerException e) {
            System.out.println("Null referans hatası gerçekleşti....");
        }
        finally{
            System.out.println("Finally metodu aktif oalrak çalışıyor..");
        }
        System.out.println("***************************************");
         try {
            String s = "hllbr" ;
            System.out.println(s.hashCode());
            
        } catch (NullPointerException e) {
            System.out.println("Null referans hatası gerçekleşti....");
        }
        finally{
            System.out.println("Finally metodu aktif oalrak çalışıyor..");
        }
         System.out.println("****************************************************************");
          try {
              int a = 30/0;
         
            
        } catch (NullPointerException e) {
            System.out.println("Null referans hatası gerçekleşti....");
        }
        finally{
            System.out.println("Finally metodu aktif oalrak çalışıyor..");
        }//programımızın direkt olarak sonlanmasını istemiyorsak mutalak bir adet catch blokuna ihtiyacımız var...
          
    }
    
}
