<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:dataForm modelAttribute="patientcustomer" entityId="${patientcustomer.id}">
		<table>
			<tbody>
				<tr>
					<shr:dataItem  path='mycustomer'  >
						<table class='detailProvider' width='100%'><tr><td>${shr:renderEntity(patientcustomer.mycustomer, pageContext)}</td>
						<td><form:input type="hidden" path="id" /></td>
						</tr></table>
					</shr:dataItem>
					<shr:detailProvider detailMember='mycustomer' targetId="${patientcustomer.mycustomer.id}"  />
				</tr>
				<tr>
					<shr:dataItem  path='isthepatient'  >
						<shr:checkBox /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='relationship'  >
						<shr:textArea /><shr:errors />
					</shr:dataItem>
				</tr>
			</tbody>
		</table>
		<shr:statusBar />
		<shr:formButtons />
	</shr:dataForm>
</html>
