<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:dataForm modelAttribute="customer" entityId="${customer.id}">
		<table>
			<tbody>
				<tr>
					<shr:dataItem  path='title'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='lastname'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='firstname'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='address'  >
						<shr:textArea /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='zipcode'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='city'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='email'  >
						<shr:textArea /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='mobilephone'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='state'  >
						<shr:select>
							<form:option value="${null}" label="----" />
							<form:options items="${states}" itemLabel="name" itemValue="id" />
						</shr:select>
						<shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='country'  >
						<shr:select>
							<form:option value="${null}" label="----" />
							<form:options items="${countries}" itemLabel="name" itemValue="id" />
						</shr:select>
						<shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='taxcode'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
			</tbody>
		</table>
		<shr:statusBar />
		<shr:formButtons />
		<shr:detailManager entity='patientcustomer'  property='mypatient'  fields='lastname,firstname,imagepreview,[image]'  viewProperty='true'  noDelete='true'  noAdd='true' />
	</shr:dataForm>
</html>
