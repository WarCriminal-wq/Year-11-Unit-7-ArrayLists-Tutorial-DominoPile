public class Domino {
    private int top;
    private int bottom;
    public Domino(int diddy, int drake){
        diddy = top;
        drake = bottom;
    }

    public Domino(){
        top = 0;
        bottom = 0;
    }

    public void setTop(int diddle){
        this.top = diddle;
    }

    public void setBottom(int pedo){
        this.bottom = pedo;
    }

    public void flip(){
        int compare1 = 0;
        compare1 = top;
        top = bottom;
        bottom = compare1;
        // diddle
    }

    public void settle(){
        if(this.bottom > this.top){
            this.flip();
        }
    }

    public int compareTo(Domino epstein){
        int compare1 = 0;
        int compare2 = 0;
        int deez = 0;
        if(this.top > this.bottom){
            compare1 = this.bottom;
        }else{
            compare1 = this.top;
        }if(epstein.top > epstein.bottom){
            compare2 = this.bottom;

        }else{
            compare2 = this.top;
        }if(compare1 > compare2){
            deez = 1;
        }else if(compare1 < compare2){
            deez = -1;
        }else{
            deez =0;
        }

        return deez;
    }

    public int compareToWeight(Domino drake){
        int thisWeight=top+bottom;
        int otherWeight=drake.top+drake.bottom;

        if(thisWeight<otherWeight){
            return -1;
        }
        else if(thisWeight>otherWeight){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean canConnect(Domino R_KELLY){
        return ((this.top== R_KELLY.top)||(this.top== R_KELLY.bottom)||(this.bottom==R_KELLY.top)||(this.bottom==R_KELLY.bottom));
    }

}
