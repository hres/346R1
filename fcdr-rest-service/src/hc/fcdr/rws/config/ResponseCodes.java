package hc.fcdr.rws.config;

public enum ResponseCodes
{
 OK(200, "OK"),
 CREATED(201, "Created"),
 ACCEPTED(202, "Accepted"),
 NO_DATA_FOUND(203, "No data found"),
 NO_CONTENT(204, "No Content"),
 EMPTY_REQUEST(205, "No query values entered"),
 DATA_ACCESS_ERROR(206, "Data access error"),
 MOVED_PERMANENTLY(301, "Moved Permanently"),
 SEE_OTHER(303, "See Other"),
 NOT_MODIFIED(304, "Not Modified"),
 TEMPORARY_REDIRECT(307, "Temporary Redirect"),
 BAD_REQUEST(400, "Bad Request"),
 UNAUTHORIZED(401, "Unauthorized"),
 FORBIDDEN(403, "Forbidden"),
 NOT_FOUND(404, "Not Found"),
 FILE_NOT_FOUND(405, "File or folder not found."),
 NOT_ACCEPTABLE(406, "Not Acceptable Input"),
 USER_NOT_FOUND(407, "User not found."),
 USER_NOT_AUTHORIZED(408,
                     "The user is not authorized to access to this resource."),
 CONFLICT(409, "Conflict"),
 GONE(410, "Gone"),
 PRECONDITION_FAILED(412, "Precondition Failed"),
 UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
 INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
 SERVICE_UNAVAILABLE(503, "Service Unavailable"),
 INVALID_INTEGER(600, "Invalid integer value entered"),
 INVALID_DOUBLE(601, "Invalid double value entered"),
 INVALID_DATE(602, "Invalid date(s) entered"),
 INVALID_UPC(603, "Invalid upc code entered"),
 NO_PRODUCT_FOUND(700, "No product found"),
 MISSING_PRODUCT_DESCRIPTION(701, "Missing Product Description");

    private final int    code;
    private final String message;

    ResponseCodes(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }
}
