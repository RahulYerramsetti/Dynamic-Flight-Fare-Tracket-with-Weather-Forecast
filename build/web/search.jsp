
<%@ page import="common.Fetch" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <title>Dynamic Flight Fare Tracker</title>
    </head>
    <body background="bg.jpg">
        <center style="font-family:bold garamond; font-size: 400%;color:#FFBF00 ">Dynamic Flight Fare Tracker</center>
        <p3color:#0404BF>.      </p3>
        <%
            Fetch f = new Fetch();
            f.TestFunction();
            %>
        <html:form action="/search">
            <table border="0";>

                <tbody>

                    <tr>
                        <td colspan="2">
                            <bean:write name="SearchForm" property="error" filter="false"/>
                            &nbsp;</td>
                    </tr>


                    <tr>
                        <td>Enter Source:</td>

                        <td><html:text property="source1" /></td>

                    </tr>
                    <tr>
                        <td>Enter Destination:</td>

                        <td><html:text property="destination1" /></td>
                    </tr>
                    <tr>
                        <td>Enter Date in (yyyy-mm-dd):</td>
                        <td><html:text property="date1" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Search" /></td>
                    </tr>
                    
                </tbody>
            </table>

           

        </html:form>
    </body>
</html>
