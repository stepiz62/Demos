<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:dataForm modelAttribute="patient" entityId="${patient.id}">
		<table>
			<tbody>
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
					<shr:dataItem  path='sex'  >
						<shr:errors />
							<shr:radioButton value='0' valueLabel='attr.sex_01' /><br>
							<shr:radioButton value='1' valueLabel='attr.sex_02' /><br>
							<%-- <shr:radioButton value=<N> valueLabel='attr.<keyN>' /><br> --%>
						</shr:dataItem>
					</tr>
					<tr>
						<shr:dataItem  path='dateofbirth'  >
							<shr:input /><shr:errors />
						</shr:dataItem>
					</tr>
					<tr>
						<shr:dataItem  path='rate1'  >
							<shr:input /><shr:errors />
						</shr:dataItem>
					</tr>
					<tr>
						<shr:dataItem  path='currency1'  >
							<shr:input /><shr:errors />
						</shr:dataItem>
					</tr>
					<tr>
						<shr:binaryItem  path='document'  >
							<shr:handout editable='true' />
						</shr:binaryItem>
					</tr>
					<tr>
						<shr:binaryItem  path='image'  previewPath='imagepreview'  >
							<shr:image editable='true' />
						</shr:binaryItem>
					</tr>
				</tbody>
			</table>
			<shr:statusBar />
			<shr:formButtons />
			<shr:detailManager entity='patientcustomer'  property='mycustomer'  fields='lastname,firstname' />
			<shr:detailManager entity='clinicalcard'  fields='number,openingdate,closingdate,imagepreview,[image]' />
		</shr:dataForm>
	</html>
