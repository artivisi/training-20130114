<%-- 
    Document   : form
    Created on : Jan 17, 2013, 8:14:28 PM
    Author     : endy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entri Kehadiran</title>
    </head>
    <body>
        <h1>Entri Kehadiran</h1>

        <spring:form modelAttribute="kehadiran">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Peserta</td>
                        <td>
                            <spring:select path="peserta">
                                <spring:option value="" label="--Pilih Peserta --"/>
                                <spring:options items="${daftarPeserta}" itemValue="id" itemLabel="nama"/>
                            </spring:select>  
                        </td>
                        <td>
                            <spring:errors path="peserta" />
                        </td>
                    </tr>
                    <tr>
                        <td>Jam Masuk</td>
                        <td><spring:input path="jamMasuk" /></td>
                        <td><spring:errors path="jamMasuk" /></td>
                    </tr>
                    <tr>
                        <td>Jam Pulang</td>
                        <td><spring:input path="jamPulang" /></td>
                        <td><spring:errors path="jamPulang" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="Simpan"></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

</spring:form>

</body>
</html>
