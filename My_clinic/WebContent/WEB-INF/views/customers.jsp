<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shr" uri="/WEB-INF/SprHibRad.tld"%>
<!DOCTYPE html >
<html>
	<shr:nvform modelAttribute="customer">
		<shr:listManager>
			<shr:searchBox>
				<shr:searchCriterion path="lastname" withOp="true">
					<shr:input /><shr:errors />
				</shr:searchCriterion>
				<shr:searchCriterion path="country" withOp="true">
					<shr:select>
					<form:option value="${null}" label="----" />
					<form:options items="${countries}" itemLabel="name" itemValue="id" />
				</shr:select>
				<shr:errors />
		</shr:searchCriterion>
</shr:searchBox>
<shr:statusBar />
<shr:resultManager fields='lastname,firstname,country' order='country' orientation=''  />
<shr:iteratorButtons />
</shr:listManager>
</shr:nvform>
</html>
