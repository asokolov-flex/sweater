
<#import "parts/common.ftl" as c>
<#import "parts/pager.ftl" as p>


<@c.page>
    <div class="form-row">
        <div class="form-group col-md-6">
            <form method="get" action="/main" class="form-inline">
                <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Search by tag"/>
                <button type="submit" class="btn btn-primary ml-2">Search</button>
            </form>
        </div>
    </div>

    <#include "parts/messageEdit.ftl" />

    <@p.pager url page />
    <#include "parts/messageList.ftl" />
    <@p.pager url page />

</@c.page>