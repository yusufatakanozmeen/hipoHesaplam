
        public class Urun {
            
            public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                
                System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
                int fiyat = scan.nextInt();
                
                double yeni_fiyat = fiyat + (fiyat * 0.18);
                
                System.out.println("KDV'li fiyat = " + yeni_fiyat);
            }
        }
    
