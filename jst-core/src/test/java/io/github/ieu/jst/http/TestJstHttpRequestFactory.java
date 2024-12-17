package io.github.ieu.jst.http;

public class TestJstHttpRequestFactory implements JstHttpRequestFactory {
    private final String responseBody;

    public TestJstHttpRequestFactory(String responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public JstHttpRequest create(JstRequestEntity<?> requestEntity) {
        TestJstHttpRequest request = new TestJstHttpRequest(new TestJstHttpResponse(responseBody));
        request.setUri(requestEntity.getUri());
        request.setMethod(requestEntity.getMethod());
        request.setHeaders(requestEntity.getHeaders());
        return request;
    }
}
