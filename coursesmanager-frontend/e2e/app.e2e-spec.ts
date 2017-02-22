import { CoursesFrontendPage } from './app.po';

describe('courses-frontend App', function() {
  let page: CoursesFrontendPage;

  beforeEach(() => {
    page = new CoursesFrontendPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
