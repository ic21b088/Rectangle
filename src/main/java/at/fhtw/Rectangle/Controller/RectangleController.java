package at.fhtw.Rectangle.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RectangleController {

    @GetMapping("/rectangle/{width}/{height}")
    public int calcRectangle(@PathVariable int width, @PathVariable int height)
    {
        return width * height;
    }

}
