<%@ include file="fragments/header.jsp" %>

<div style="padding: 30px; text-align: center;">
    <h2>Now take Appointments from Home, Save Time!</h2>
    <p>Get Treatment Done from Our Specialist Doctors</p>

    <div style="display: flex; justify-content: center; flex-wrap: wrap; gap: 20px; margin-top: 30px;">
        <div style="border: 1px solid #ccc; border-radius: 8px; padding: 20px; width: 200px;">
            <img src="${pageContext.request.contextPath}/images/doc1.png" alt="Doctor" width="100%">
            <h4>William Peterson</h4>
            <p>Specialist: Dermatologists</p>
            <p>Experience: 25</p>
            <p>Age: 55</p>
        </div>
        <div style="border: 1px solid #ccc; border-radius: 8px; padding: 20px; width: 200px;">
            <img src="${pageContext.request.contextPath}/images/doc2.png" alt="Doctor" width="100%">
            <h4>Lalit Kumar</h4>
            <p>Specialist: Immunologists</p>
            <p>Experience: 18</p>
            <p>Age: 45</p>
        </div>
        <!-- Add more doctors here -->
    </div>
</div>

<%@ include file="fragments/footer.jsp" %>
