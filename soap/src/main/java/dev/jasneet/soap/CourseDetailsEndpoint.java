package dev.jasneet.soap;

import dev.jasneet.soap.soap.bean.Course;
import dev.jasneet.soap.soap.service.CourseDetailsService;
import https.vanier_com.courses.CourseDetails;
import https.vanier_com.courses.GetCourseDetailsRequest;
import https.vanier_com.courses.GetCourseDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

    @Autowired
    CourseDetailsService service;

    @PayloadRoot(namespace = "https://vanier.com/courses", localPart="GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processDetailsResponse(@RequestPayload GetCourseDetailsRequest request){
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();
        Course course = service.findById(request.getId());
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(course.getId());
        courseDetails.setName(course.getName());
        courseDetails.setDescription(course.getDescription());
        response.setCourseDetails(courseDetails);

        return response;
    }
}
