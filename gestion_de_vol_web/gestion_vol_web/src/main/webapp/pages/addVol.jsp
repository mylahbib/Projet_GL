<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>gestion Vol</title>
<sj:head jquerytheme="redmond" />
<link rel="stylesheet" type="text/css" href="styles/style.css"/>

</head>
<body>

<jsp:include page="inc/header.jsp" flush="true" />
<div align="center">
		<h1>Ajouter Vol</h1>
		<s:form action="addVol" method="post"  >

			<div class="type-text">
				
					<sj:datepicker name="vol.date_depart" 
						displayFormat="dd/mm/y HH:mm" label="date depart " />
				<sj:datepicker name="vol.date_arriver"
						displayFormat="dd/mm/y HH:mm" label="Date arriver" />
			</div>
			
			<sj:submit value="Save" />

		</s:form>

</div>

	 
 <jsp:include page="inc/footer.jsp" />