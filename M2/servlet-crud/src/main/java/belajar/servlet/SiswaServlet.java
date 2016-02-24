package belajar.servlet;

import belajar.servlet.controller.SiswaController;
import belajar.servlet.domain.JenisKelamin;
import belajar.servlet.domain.Siswa;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello world!
 *
 */
public class SiswaServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) {

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        try {
            Siswa s = new Siswa();
            s.setNama(req.getParameter("nama"));
            s.setKelas(req.getParameter("kelas"));
            s.setAlamat(req.getParameter("alamat"));
            s.setJenisKelamin(JenisKelamin.valueOf(req.getParameter("jenisKelamin").toUpperCase()));
            SiswaController sc = new SiswaController(s);
            sc.save();

            res.sendRedirect("formsiswa.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
