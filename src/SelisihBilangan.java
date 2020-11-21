public class SelisihBilangan extends Bilangan {
    public void tampilSelisihBilangan() {
        int selisih = getX() - getY();
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + selisih);
    }
}
