<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:dataForm modelAttribute="appuser" entityId="${appuser.id}">
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
					<shr:dataItem  path='username'  >
						<shr:input /><shr:errors />
					</shr:dataItem>
				</tr>
				<tr>
					<shr:dataItem  path='password'  >
						<shr:sinput type="password" /><shr:errors />
					</shr:dataItem>
				</tr>
			</tbody>
		</table>
		<shr:statusBar />
		<shr:formButtons />
		<shr:detailManager entity='userrole'  property='roleid'  fields='name' />
	</shr:dataForm>
</html>
