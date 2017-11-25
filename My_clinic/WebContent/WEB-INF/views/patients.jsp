<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:nvform modelAttribute="patient">
		<shr:listManager>
			<shr:searchBox>
				<shr:searchCriterion path="lastname" withOp="true">
					<shr:input /><shr:errors />
				</shr:searchCriterion>
			</shr:searchBox>
			<shr:statusBar />
			<shr:resultManager fields='lastname,firstname,sex,dateofbirth,imagepreview,[image]' order='lastname,firstname' orientation='desc,asc'  />
			<shr:iteratorButtons><shr:report name="patientList" /></shr:iteratorButtons>
		</shr:listManager>
	</shr:nvform>
</html>
