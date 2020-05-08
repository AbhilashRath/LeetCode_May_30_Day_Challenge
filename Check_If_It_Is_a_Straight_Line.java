class Solution {
    //y=mx+c
    //m = (y2-y1)/x2-x1;
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=1){
            return false; 
        }
        if(coordinates.length==2){
            return true; 
        }
        int y2 = coordinates[1][1];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int x1 = coordinates[0][0];
        if(x2-x1==0){
            for(int i=2;i<coordinates.length;i++){
                if(coordinates[i][0]!=x1){
                    return false;
                }
            }
            return true;
        }else{
            double m = (y2-y1)/(x2-x1);

            double c = y2 - (m*x2);

            for(int i=2;i<coordinates.length;i++){
                int y = coordinates[i][1];
                int x = coordinates[i][0];
                if(y!=((m*x)+c)){
                    return false;
                }
            }
            return true;            
        }
    
        
    }
}
