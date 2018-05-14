<h3 class="my-4">Shop Name</h3>
<div class="list-group" style="margin-bottom: 50px">
    <c:forEach items="${categories}" var="category">
        <a href="${contextRoot}/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
    </c:forEach>
</div>