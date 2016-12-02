package seamolec.rizal.contohcustomparagraf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView contohParagraf;

    String htmlText = " %s ";
    String paragraf = "<h4 style='text-align:justify'><strong>SURVEY ONLINE STUDI AWAL TENTANG TRANSISI " +
            "RESIKO OBESITAS.</strong></h4>" +

            "<p style='text-align:justify'>Survey ini diselenggarakan oleh SEAMEO RECFON (Pusat Studi Regional Penelitian Gizi dan Kesehatan Masyarakat) yang memiliki tanggung jawab untuk terus meningkatkan status gizi masyarakat di Asia Tenggara, termasuk Indonesia.</p>" +
            "" +
            "" +
            "<p style='text-align:justify'>Anda diminta untuk menjawab setiap pertanyaan terkait <strong>data diri, status gizi, kebiasaan makan, dan aktifitas fisik.</strong> Waktu yang dibutuhkan untuk pengisian <strong>berkisar 15-20 menit.</strong> Setiap pertanyaan dilengkapi dengan instruksi untuk mempermudah Anda dalam menjawab. Tidak ada jawaban salah maupun benar, maka dimohon untuk menjawab sesuai dengan keadaan anda. Kuesioner yang sudah dilengkapi akan terekam secara otomatis</p>" +
            "" +
            "" +
            "<p style='text-align:justify'>Menu untuk mengisi data survey, data kecukupan asupan makan, dan kualitas aktivitas fisik akan muncul setelah Anda menekan tombol <strong style='color:red;'>SAYA SETUJU MENGIKUTI SURVEY</strong>.  Seluruh hasil jawaban Anda <strong>bersifat rahasia</strong> dan hanya akan diketahui oleh Anda pribadi serta tim survey.</p>" +
            "" +
            "<p style='text-align:justify'>Info lebih jelas terkait survey ini dapat ditujukan pada:</p>" +
            "<p style='text-align:center'>Ir. Helda Khusun, PhD./ Dr. dr. Aria Kekalih, MTI/ Dr. Luh Ade Ari Wiradnyani, MSc.\n" +
            "SEAMEO-Regional Center for Food and Nutrition/RECFON \n" +
            "Pusat Kajian Makanan dan Gizi Regional Universitas Indonesia\n" +
            "Jl. Salemba Raya no 6, Jakarta Pusat 10430\n" +
            "Telp 021-31930205, 3913932\n</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contohParagraf = (TextView)findViewById(R.id.tvParagraf);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadData(String.format(htmlText, paragraf), "text/html", "utf-8");






    }
}
