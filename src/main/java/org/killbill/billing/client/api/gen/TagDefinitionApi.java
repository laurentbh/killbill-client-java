package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.TagDefinition;
import java.util.UUID;
import org.killbill.billing.util.api.AuditLevel;
import org.killbill.billing.client.model.TagDefinitions;
import java.util.List;


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
public class TagDefinitionApi {

    private final KillBillHttpClient httpClient;

    public TagDefinitionApi() {
        this(new KillBillHttpClient());
    }

    public TagDefinitionApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public TagDefinition createTagDefinition(final TagDefinition body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createTagDefinition");

        final String uri = "/1.0/kb/tagDefinitions";


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();


        return httpClient.doPost(uri, body, TagDefinition.class, requestOptions);
    }

    public void deleteTagDefinition(final UUID tagDefinitionId,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(tagDefinitionId, "Missing the required parameter 'tagDefinitionId' when calling deleteTagDefinition");

        final String uri = "/1.0/kb/tagDefinitions/{tagDefinitionId}"
          .replaceAll("\\{" + "tagDefinitionId" + "\\}", tagDefinitionId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        httpClient.doDelete(uri, requestOptions);
    }

    public TagDefinition getTagDefinition(final UUID tagDefinitionId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(tagDefinitionId, "Missing the required parameter 'tagDefinitionId' when calling getTagDefinition");

        final String uri = "/1.0/kb/tagDefinitions/{tagDefinitionId}"
          .replaceAll("\\{" + "tagDefinitionId" + "\\}", tagDefinitionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, TagDefinition.class, requestOptions);
    }

    public TagDefinitions getTagDefinitions(final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/tagDefinitions";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, TagDefinitions.class, requestOptions);
    }

}
