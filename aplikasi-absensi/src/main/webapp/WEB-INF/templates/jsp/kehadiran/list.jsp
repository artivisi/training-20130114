<%-- 
    Document   : list
    Created on : Jan 17, 2013, 6:17:02 PM
    Author     : endy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Kehadiran</title>
    </head>
    <body>
        <h1>Daftar Kehadiran</h1>
        
        <a href="form">Tambah Data Baru</a>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Nomer</th>
                    <th>Nama</th>
                    <th>Jenis Peserta</th>
                    <th>Masuk</th>
                    <th>Pulang</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="k" items="${daftarKehadiran}">
                    <tr>
                        <td>${k.peserta.nomor}</td>
                        <td>${k.peserta.nama}</td>
                        <td></td>
                        <td>${k.jamMasuk}</td>
                        <td>${k.jamPulang}</td>
                        <td>
                            <a href="view?id=${k.id}">lihat</a> | 
                            <a href="form?id=${k.id}">edit</a> | 
                            <a href="delete?id=${k.id}">hapus</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>