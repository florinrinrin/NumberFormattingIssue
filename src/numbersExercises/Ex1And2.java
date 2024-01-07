package numbersExercises;

public class Ex1 {
    public static void main(String[] args) {
        // Let H    G    F    E    D    C    B    A  -  be assigned values
        //    128   64   32   16   8    4    2    1
        int H = 128, G = 64, F = 32, E = 16, D = 8, C = 4, B = 2, A = 1;
        int ADC = A | D | C;
        int AEC = 0b00000001 | 0b00010000 | 0b00000100;
    getRadioSignals(AEC,E);
    }

    public static void getRadioSignals(int radioCode, int checkRadioSpecific) {

        if ((radioCode & checkRadioSpecific)  == checkRadioSpecific) {
            System.out.println("signal is present in here");
        } else {
            System.out.println("Signal is not present in here");
        }
    }
}
