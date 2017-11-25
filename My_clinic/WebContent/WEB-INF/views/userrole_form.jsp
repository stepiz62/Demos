<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:dataForm modelAttribute="userrole" entityId="${userrole.id}">
		<table>
			<tbody>
				<tr>
					<shr:dataItem  path='roleid'  >
						<shr:select>
							<form:option value="${null}" label="----" />
							<form:options items="${roles}" itemLabel="name" itemValue="id" />
						</shr:select>
						<shr:errors />
					</shr:dataItem>
				</tr>
			</tbody>
		</table>
		<shr:statusBar />
		<shr:formButtons />
	</shr:dataForm>
</html>
