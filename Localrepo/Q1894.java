public class Q1894 {
    public int chalkReplacer(int[] chalk, int k) {
        long chalkPieces = 0;
        for(int i : chalk){
            chalkPieces += i;
        } 
        k%= chalkPieces;
        for(int i=0; i<chalk.length; i++){
            if(k < chalk[i]){
                return i;
            }
            k-= chalk[i];
        }
        return -1;
    }
}
