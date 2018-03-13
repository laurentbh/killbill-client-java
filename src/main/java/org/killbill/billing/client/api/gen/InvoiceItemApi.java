package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.CustomField;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import org.killbill.billing.client.model.CustomFields;
import java.util.List;
import org.killbill.billing.util.api.AuditLevel;
import org.killbill.billing.client.model.Tags;


import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.base.MoreObjects;

import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.util.api.AuditLevel;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class InvoiceItemApi {

    private final KillBillHttpClient httpClient;

    public InvoiceItemApi() {
        this(new KillBillHttpClient());
    }

    public InvoiceItemApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CustomFields createCustomFields(final UUID invoiceItemId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();


        return httpClient.doPost(uri, body, CustomFields.class, requestOptions);
    }

    public void createTags(final UUID invoiceItemId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling createTags");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/tags"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();


        httpClient.doPost(uri, null, requestOptions);
    }

    public void deleteCustomFields(final UUID invoiceItemId, final String customFieldList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("customFieldList", String.valueOf(customFieldList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteTags(final UUID invoiceItemId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling deleteTags");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/tags"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public CustomFields getCustomFields(final UUID invoiceItemId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling getCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Tags getTags(final UUID invoiceItemId, final UUID accountId, final AuditLevel auditLevel, final Boolean includedDeleted,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling getTags");
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling getTags");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/tags"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("accountId", String.valueOf(accountId));
        queryParams.put("auditLevel", String.valueOf(auditLevel));
        queryParams.put("includedDeleted", String.valueOf(includedDeleted));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public CustomFields modifyCustomFields(final UUID invoiceItemId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/invoiceItems/{invoiceItemId}/customFields"
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doPut(uri, body, CustomFields.class, requestOptions);
    }

}
