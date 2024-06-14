<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.File"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Galería de Imágenes</title>
    <style>
        .gallery {
            display: flex;
            flex-wrap: wrap;
        }
        .gallery img {
            margin: 5px;
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
    <h1>Galería de Imágenes</h1>
    <div class="gallery">
        <%
            String imagesDir = application.getRealPath("/imagen");
            File dir = new File(imagesDir);
            File[] files = dir.listFiles();
            
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && (file.getName().endsWith(".jpg") || file.getName().endsWith(".png") || file.getName().endsWith(".gif"))) {
                        String imagePath = "imagen/" + file.getName();
                        out.println("<img src=\"" + imagePath + "\" alt=\"" + file.getName() + "\" width=\"150\" height=\"150\">");
                    }
                }
            } else {
                out.println("<p>No se encontraron imágenes en el directorio.</p>");
            }
        %>
    </div>
</body>
</html>
