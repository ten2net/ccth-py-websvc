/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.CreateEntityRequest
import io.swagger.client.model.ListEntitiesResponse
import io.swagger.client.model.ReplaceAllEntityAttributesRequest
import io.swagger.client.model.RetrieveEntityAttributesResponse
import io.swagger.client.model.RetrieveEntityResponse
import io.swagger.client.model.UpdateExistingEntityAttributesRequest
import io.swagger.client.model.UpdateOrAppendEntityAttributesRequest
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object EntitiesApi {

  /**
   * 通过id，类型，模式匹配(id或类型)and/or 与查询或地理查询匹配的实体来检索符合不同条件的实体列表(请参阅[Simple Query Language](＃simple_query_language)和 [地理查询](#geographical_queries)。给定的实体必须匹配要检索的所有条件\\ n(即，标准以逻辑AND方式组合)。注意模式匹配查询参数不兼容\\ n(即相互排斥)及其对应的精确匹配参数，即带有&#x60;id&#x60;的&#x60;idPattern&#x60;和带有&#x60;type&#x60;的&#x60;typePattern&#x60;。\\ n响应有效负载是每个匹配实体包含一个对象的数组。每个实体遵循\\ JSON实体表示格式(在“JSON实体表示”部分中描述)。响应代码： *成功操作使用200 OK  *错误使用非2xx和(可选)错误有效负载。请参阅小节\\“错误回应\\” 更多细节。
   * 
   * Expected answers:
   *   code 200 : Seq[ListEntitiesResponse] 
   * 
   * @param id 以逗号分隔的元素列表。检索ID与列表中某个元素匹配的实体。与&#x60;idPattern&#x60;不兼容。
   * @param `type` 以逗号分隔的元素列表。检索其类型与列表中某个元素匹配的实体。与&#x60;typePattern&#x60;不兼容。
   * @param idPattern 正确格式化的正则表达式。检索ID与正则表达式匹配的实体。与&#x60;id&#x60;不兼容。
   * @param typePattern 正确格式化的正则表达式。检索类型与正则表达式匹配的实体。与&#x60;type&#x60;不兼容。
   * @param `q` 一个查询表达式，由一个语句列表组成，由&#x60;;&#x60;分隔，即q &#x3D; statement1; statement2; statement3。\\ n查看[Simple Query Language specification](＃simple_query_language)。
   * @param mq 属性元数据的查询表达式，由由&#x60;;&#x60;分隔的语句列表组成，即mq &#x3D; statement1; statement2; statement3。查看[简单查询语言规范](＃simple_query_language)。
   * @param georel 匹配实体和引用形状之间的空间关系。请参阅[地理查询](#geographical_queries)。
   * @param geometry 查询受限的地理区域。请参阅[地理查询](#geographical_queries)。
   * @param coords 纬度 - 经度列表由坐标分隔的坐标”;“。参见[地理查询](#geographical_queries)。
   * @param limit 限制要检索的实体数量
   * @param offset 建立从检索实体的位置的偏移量
   * @param attrs 以逗号分隔的属性名称列表，其数据将包含在响应中。按照此参数指定的顺序检索属性。如果未包含此参数，则以任意方式检索属性命令。\\ n请参阅“过滤属性和元数据”部分以获取更多详细信息。
   * @param metadata 要包含在响应中的元数据名称列表。请参阅”过滤掉属性和元数据“部分以获取更多详细信息。
   * @param orderBy 排序结果的标准。请参阅”订购结果“部分了解详情。
   * @param options 选项词典
   */
  def 列出实体(id: Option[String] = None, `type`: Option[String] = None, idPattern: Option[String] = None, typePattern: Option[String] = None, `q`: Option[String] = None, mq: Option[String] = None, georel: Option[String] = None, geometry: Option[String] = None, coords: Option[String] = None, limit: Option[Double] = None, offset: Option[Double] = None, attrs: Option[String] = None, metadata: Option[String] = None, orderBy: Option[String] = None, options: Option[String] = None): ApiRequest[Seq[ListEntitiesResponse]] =
    ApiRequest[Seq[ListEntitiesResponse]](ApiMethods.GET, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities", "application/json  develop ccthAPI")
      .withQueryParam("id", id)
      .withQueryParam("type", `type`)
      .withQueryParam("idPattern", idPattern)
      .withQueryParam("typePattern", typePattern)
      .withQueryParam("q", `q`)
      .withQueryParam("mq", mq)
      .withQueryParam("georel", georel)
      .withQueryParam("geometry", geometry)
      .withQueryParam("coords", coords)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("attrs", attrs)
      .withQueryParam("metadata", metadata)
      .withQueryParam("orderBy", orderBy)
      .withQueryParam("options", options)
      .withSuccessResponse[Seq[ListEntitiesResponse]](200)
        /**
   * payload是表示要创建的实体的对象。该对象遵循JSON实体表示格式(在”JSON实体表示“部分中描述)。响应： *成功的操作使用201创建(如果未使用upsert选项)或204 No Content(如果使用 upsert选项).Response包含一个带有创建实体的URL的&#x60;Location&#x60;标题。 *错误使用非2xx和(可选)错误有效负载。有关更多详细信息，请参阅“错误响应”部分。
   * 
   * Expected answers:
   *   code 204 :  
   * 
   * @param contentType 
   * @param body 
   * @param options 选项词典
   */
  def 创建实体(contentType: String, body: CreateEntityRequest, options: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities", "application/json  develop ccthAPI")
      .withBody(body)
      .withQueryParam("options", options)
      .withHeaderParam("Content-Type", contentType)
      .withSuccessResponse[Unit](204)
        /**
   * 删除实体。Response： * S.uccessful operation使用204 No Content  * Errors使用非2xx和(可选)错误有效负载。有关更多详细信息，请参阅“错误响应”部分。
   * 
   * Expected answers:
   *   code 204 :  
   * 
   * @param entityId 要删除的实体的ID
   * @param `type` 实体类型，以避免在存在多个具有相同实体ID的的情况下出现歧义。
   */
  def 删除实体(entityId: String, `type`: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities/{entityId}", "application/json  develop ccthAPI")
      .withQueryParam("type", `type`)
      .withPathParam("entityId", entityId)
      .withSuccessResponse[Unit](204)
        /**
   * 请求payload是表示要追加或更新的属性的对象。该对象遵循JSON实体表示格式(在”JSON实体表示“部分中描述)，除了&#x60;n&#x60;和&#x60;type&#x60; &#x60;不允许。实体属性用有效负载中的属性更新，具体取决于是否使用&#x60;append&#x60;操作选项。 *如果未使用&#x60;append&#x60;：实体属性被更新(如果它们以前存在)或附加(如果它们以前不存在)与有效载荷中的那些。 *如果使用&#x60;append&#x60;(即严格附加语义)：有效载荷中的所有属性都不是\\ n之前存在于实体中的是附加的。除此之外，如果有效负载中的某些属性已存在于实体中，则会返回错误。响应： *成功操作使用204无内容\\ n *错误使用非2xx和(可选)错误有效负载。有关更多详细信息，请参阅“错误响应”部分。
   * 
   * Expected answers:
   *   code 204 :  
   * 
   * @param entityId 要更新的实体ID
   * @param contentType 
   * @param body 
   * @param `type` 实体类型，以避免在存在多个具有相同实体ID的的情况下出现歧义。
   * @param options 操作选项
   */
  def 更新或附加实体属性(entityId: String, contentType: String, body: UpdateOrAppendEntityAttributesRequest, `type`: Option[String] = None, options: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities/{entityId}/attrs", "application/json  develop ccthAPI")
      .withBody(body)
      .withQueryParam("type", `type`)
      .withQueryParam("options", options)
      .withPathParam("entityId", entityId)
      .withHeaderParam("Content-Type", contentType)
      .withSuccessResponse[Unit](204)
        /**
   * 请求payload是表示要更新的属性的对象。该对象遵循JSON实体表示格式(在”JSON实体表示“部分中描述)，除了&#x60;n&#x60;和&#x60;type&#x60;是不允许。\\ n实体属性用有效负载中的实体属性更新。除此之外，如果有效负载中的一个或多个attributes不存在于实体中，则返回错误。\\ nResponse： *成功操作使用204 No Content  *错误使用非2xx和(可选)错误有效负载。有关更多详细信息，请参阅“错误响应”部分。
   * 
   * Expected answers:
   *   code 204 :  
   * 
   * @param entityId 要更新的实体的ID
   * @param contentType 
   * @param body 
   * @param `type` 实体类型，以避免在存在多个具有相同实体ID的的情况下出现歧义。
   * @param options 操作选项
   */
  def 更新现有实体属性(entityId: String, contentType: String, body: UpdateExistingEntityAttributesRequest, `type`: Option[String] = None, options: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PATCH, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities/{entityId}/attrs", "application/json  develop ccthAPI")
      .withBody(body)
      .withQueryParam("type", `type`)
      .withQueryParam("options", options)
      .withPathParam("entityId", entityId)
      .withHeaderParam("Content-Type", contentType)
      .withSuccessResponse[Unit](204)
        /**
   * 请求payload是一个表示新实体属性的对象。该对象遵循JSON实体表示格式(在上面的”JSON实体表示“中描述)，除了&#x60;n&#x60;和&#x60;type&#x60;不允许。\\ n先前存在于实体中的属性将被删除并替换为request中的属性。Response： *成功操作使用204无内容 *错误使用非2xx和(可选)错误有效载荷。有关详细信息，请参阅\\“错误响应\\”小节。
   * 
   * Expected answers:
   *   code 204 :  
   * 
   * @param entityId 有关实体的ID。
   * @param contentType 
   * @param body 
   * @param `type` 实体类型，以避免在存在多个具有相同实体ID的的情况下出现歧义。
   * @param options 操作选项
   */
  def 替换所有实体属性(entityId: String, contentType: String, body: ReplaceAllEntityAttributesRequest, `type`: Option[String] = None, options: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities/{entityId}/attrs", "application/json  develop ccthAPI")
      .withBody(body)
      .withQueryParam("type", `type`)
      .withQueryParam("options", options)
      .withPathParam("entityId", entityId)
      .withHeaderParam("Content-Type", contentType)
      .withSuccessResponse[Unit](204)
        /**
   * response是一个对象，表示由ID标识的实体。该对象遵循JSON实体表示格式(在”JSON实体表示“部分中描述)。\\ n此操作必须仅返回一个实体元素，但是可能有多个具有same ID的实体(例如，具有相同ID但不同类型的实体)。\\ n在这种情况下，将返回错误消息，HTTP状态代码设置为409 Conflict。Response： *成功的操作使用200 OK \\ n *错误使用非2xx和(可选)错误有效负载。有关详细信息，请参阅“错误响应”部分。
   * 
   * Expected answers:
   *   code 200 : RetrieveEntityResponse 
   * 
   * @param entityId 要检索的实体的ID
   * @param `type` 实体类型，以避免在存在多个具有相同实体ID的的情况下出现歧义。
   * @param attrs 以逗号分隔的属性名称列表，其data必须包含在响应中。属性按照\\ nthis参数指定的顺序检索。有关详细信息，请参阅”过滤属性和元数据“部分。 \\ n如果不包含此参数，则以任意顺序检索属性，并且实体的所有属性都包含在响应中。
   * @param metadata 要包含在响应中的元数据名称列表。请参阅”过滤掉属性和元数据“部分以获取更多详细信息。
   * @param options 选项词典
   */
  def 检索实体(entityId: String, `type`: Option[String] = None, attrs: Option[String] = None, metadata: Option[String] = None, options: Option[String] = None): ApiRequest[RetrieveEntityResponse] =
    ApiRequest[RetrieveEntityResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities/{entityId}", "application/json  develop ccthAPI")
      .withQueryParam("type", `type`)
      .withQueryParam("attrs", attrs)
      .withQueryParam("metadata", metadata)
      .withQueryParam("options", options)
      .withPathParam("entityId", entityId)
      .withSuccessResponse[RetrieveEntityResponse](200)
        /**
   * 这个请求类似于retreiving整个实体，但是这个请求省略了&#x60;id&#x60;和&#x60;type&#x60; fields。\\ n就像获取整个实体的一般请求一样，这个操作必须只返回一个entity如果找到多个具有相同ID的实体(例如，具有same ID但类型不同的实体)，则返回错误消息，HTTP状态代码设置为409 Conflict。Response： *成功操作使用200 OK  *错误使用非2xx和(可选)错误有效负载。有关详细信息，请参阅\\“错误响应\\”小节。
   * 
   * Expected answers:
   *   code 200 : RetrieveEntityAttributesResponse 
   * 
   * @param entityId 要检索的实体的ID
   * @param `type` 实体类型，以避免在存在多个具有相同实体ID的的情况下出现歧义。
   * @param attrs 以逗号分隔的属性名称列表，其data将包含在响应中。属性按照此参数指定的顺序检索。\\ n如果不包含此参数，则以任意方式检索属性订单，以及实体的所有属性都包含在响应中。\\ n请参阅“过滤掉属性和元数据”部分以获取更多详细信息。
   * @param metadata 要包含在响应中的元数据名称列表。请参阅”过滤掉属性和元数据“部分以获取更多详细信息。
   * @param options 选项词典
   */
  def 检索实体属性(entityId: String, `type`: Option[String] = None, attrs: Option[String] = None, metadata: Option[String] = None, options: Option[String] = None): ApiRequest[RetrieveEntityAttributesResponse] =
    ApiRequest[RetrieveEntityAttributesResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/ten2net/NGSI/1.0.0", "/v2/entities/{entityId}/attrs", "application/json  develop ccthAPI")
      .withQueryParam("type", `type`)
      .withQueryParam("attrs", attrs)
      .withQueryParam("metadata", metadata)
      .withQueryParam("options", options)
      .withPathParam("entityId", entityId)
      .withSuccessResponse[RetrieveEntityAttributesResponse](200)
      

}

