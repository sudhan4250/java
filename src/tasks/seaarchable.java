package tasks;

interface seaarchable {
        void search(String keyword);
    }
    class Document implements seaarchable {
        private String content;

        public Document(String content) {
            this.content = content;
        }

        @Override
        public void search(String keyword) {
            if (content.contains(keyword)) {
                System.out.println("Keyword '" + keyword + "' found in document.");
            } else {
                System.out.println("Keyword '" + keyword + "' not found in document.");
            }
        }
    }
    class WebPage implements seaarchable {
        private String url;
        private String pageContent;

        public WebPage(String url, String pageContent) {
            this.url = url;
            this.pageContent = pageContent;
        }

        @Override
        public void search(String keyword) {
            if (pageContent.contains(keyword)) {
                System.out.println("Keyword '" + keyword + "' found on web page at " + url);
            } else {
                System.out.println("Keyword '" + keyword + "' not found on web page at " + url);
            }
        }
    }

    class name3 {
        public static void main(String[] args) {
            Document document = new Document("This is a sample document containing some text.");
            WebPage webPage = new WebPage("https://www.example.com", "This is a sample web page content.");
            document.search("sample");
            webPage.search("example");
        }
    }


