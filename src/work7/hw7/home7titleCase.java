package work7.hw7;

public class home7titleCase {
    public static void main(String[] args) {
        String sen1=ConvertTittle("Happy nEw YEar tO YoU dEaR");
        String sen2=ConvertTittle("gOOd mOrnIng");
        String sen3=ConvertTittle("mAke aMerica gReat aGAiN");
        System.out.println(sen1);
        System.out.println(sen2);
        System.out.println(sen3);
    }




    public static String ConvertTittle(String Sentence) {
        String[] senToUopConv = Sentence.toLowerCase().split(" ");
        String convertSentence = "";
        for (int i = 0; i < senToUopConv.length; i++) {
            convertSentence += senToUopConv[i].substring(0, 1).toUpperCase() + senToUopConv[i].substring(1) + " ";
        }


        return convertSentence;
    }
}
