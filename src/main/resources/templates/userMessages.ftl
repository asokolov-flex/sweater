<#import "parts/common.ftl" as c>

<#import "parts/pager.ftl" as p>

<@c.page>
    <h3>${userChannel.username}</h3>
    <#if !isCurrentUser>
        <#if isSubscriber>
            <a class="btn btn-info" href="/users/unsubscribe/${userChannel.id}">Unsubscribe</a>
        <#else>
            <a class="btn btn-info" href="/users/subscribe/${userChannel.id}">Subscribe</a>
        </#if>
    </#if>
    <div class="container my-3">
        <div class="row">
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <div class="card-title">Subscriptions</div>
                        <h3 class="card-text">
                            <a href="/users/subscriptions/${userChannel.id}/list">${subscriptionsCount}</a>
                        </h3>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <div class="card-title">Subscribers</div>
                        <h3 class="card-text">
                            <a href="/users/subscribers/${userChannel.id}/list">${subscribersCount}</a>
                        </h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <#if isCurrentUser>
        <#include "parts/messageEdit.ftl" />
    </#if>

    <@p.pager url page />
    <#include "parts/messageList.ftl" />
    <@p.pager url page />
</@c.page>