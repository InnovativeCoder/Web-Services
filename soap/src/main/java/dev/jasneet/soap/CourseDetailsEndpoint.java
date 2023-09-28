package dev.jasneet.soap;

import https.vanier_com.courses.CourseDetails;
import https.vanier_com.courses.GetCourseDetailsRequest;
import https.vanier_com.courses.GetCourseDetailsResponse;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

    @PayloadRoot(namespace = "https://vanier.com/courses", localPart="GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processDetailsResponse(GetCourseDetailsRequest request){
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();

        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(request.getId());
        courseDetails.setName("Microservices course");
        courseDetails.setDescription("A course on micro services");
        response.setCourseDetails(courseDetails);

        return response;
    }
}
