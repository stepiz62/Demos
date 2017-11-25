<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:dataForm modelAttribute="clinicalcard" entityId="${clinicalcard.id}">
		<table>
			<tbody>
				<tr>
					<shr:dataItem  path='number'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='openingdate'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='closingdate'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='note'  >
						<shr:textArea /><shr:errors />
					</shr:dataItem>
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
	</shr:dataForm>
</html>
