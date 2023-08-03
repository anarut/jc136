package academy.lesson20;

public class DownloadImageTask implements Task {

    @Override
    public byte[] download() {
        return new byte[0];
    }

    @Override
    public int complexity() {
        return 1;
    }
}
