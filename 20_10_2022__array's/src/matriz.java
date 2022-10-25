public class matriz {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];

        for(int x=0; x< matriz.length; x++){
            for(int y=0; y<matriz.length; y++){
              
                matriz[x][y]= x+y;
            }
        }

        
        for(int x=0; x< matriz.length; x++){
            System.out.print("\n");
            for(int y=0; y<matriz.length; y++){
                System.out.print(matriz[x][y]+"\t");
            }
        }
    }
}
