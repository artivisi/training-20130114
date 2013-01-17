<%-- 
    Document   : form
    Created on : Jan 17, 2013, 8:14:28 PM
    Author     : endy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entri Kehadiran</title>
    </head>
    <body>
        <h1>Entri Kehadiran</h1>
        
        <form method="post">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Peserta</td>
                        <td><input name="peserta"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Jam Masuk</td>
                        <td><input name="jamMasuk"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Jam Pulang</td>
                        <td><input name="jamPulang"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="Simpan"></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
    </body>
</html>
